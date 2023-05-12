package webuild.esprit.tn.tunisiacampwebapplication.Services;

import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webuild.esprit.tn.tunisiacampwebapplication.Entities.Invoice;
import webuild.esprit.tn.tunisiacampwebapplication.Repositories.CommandeRepo;
import webuild.esprit.tn.tunisiacampwebapplication.Repositories.InvoiceRepo;

import javax.swing.text.Document;
import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

@Service
@Slf4j
public class InvoiceServices implements IInvoiceServices{
    @Autowired
    InvoiceRepo invoiceRepo;
    @Autowired
    CommandeRepo commandeRepo;
    @Override
    public List<Invoice> retrieveAllInvoice() {
        return invoiceRepo.findAll();
    }

    @Override
    public Invoice createInvoice(Integer idCommande) {
        return null;
    }


    @Override
    public void generatePdf(Integer commandeId) throws IOException {

}
}
