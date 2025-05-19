package com.data.sesson10_webjava.controller;

import com.data.sesson10_webjava.model.Document;
import com.data.sesson10_webjava.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import java.io.File;

@Controller
public class DocumentController {
    @Autowired
    private DocumentRepository documentRepository;

    @GetMapping("/form")
    public ModelAndView showForm() {
        ModelAndView mav = new ModelAndView("documentForm.jsp");
        mav.addObject("document", new Document());
        return mav;
    }

    @PostMapping("/upload")
    public ModelAndView uploadDocument(@ModelAttribute("document") Document doc, HttpServletRequest request) {
        try {
            MultipartFile file = doc.getFile();
            String fileName = file.getOriginalFilename();

            String uploadPath = request.getServletContext().getRealPath("/uploads");
            File uploadDir = new File(uploadPath);
            if (!uploadDir.exists()) {
                uploadDir.mkdir();
            }

            String fullPath = uploadPath + File.separator + fileName;
            file.transferTo(new File(fullPath));

            documentRepository.save(doc.getTitle(), doc.getDescription(), "uploads/" + fileName);

            ModelAndView mav = new ModelAndView("documentResult.jsp");
            mav.addObject("message", "Upload thành công!");
            return mav;
        } catch (Exception e) {
            e.printStackTrace();
            ModelAndView mav = new ModelAndView("documentResult.jsp");
            mav.addObject("message", "Upload thất bại: " + e.getMessage());
            return mav;
        }
    }
}
