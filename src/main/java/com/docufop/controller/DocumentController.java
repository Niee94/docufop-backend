package com.docufop.controller;

import com.docufop.service.PdfService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/documents")
public class DocumentController {

    @Autowired
    private PdfService pdfService;

    @GetMapping("/test-pdf")
    public ResponseEntity<byte[]> generateTestPdf() {
        String htmlContent = "<html><body><h1>Тестовий рахунок</h1><p>Сума: 5000 грн</p></body></html>";
        byte[] pdfBytes = pdfService.generatePdfFromHtml(htmlContent);

        return ResponseEntity.ok()
            .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=test_invoice.pdf")
            .contentType(MediaType.APPLICATION_PDF)
            .body(pdfBytes);
    }
}
