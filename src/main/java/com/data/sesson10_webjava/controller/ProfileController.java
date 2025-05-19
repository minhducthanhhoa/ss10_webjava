package com.data.sesson10_webjava.controller;

import com.data.sesson10_webjava.model.UserProfile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/profile")
public class ProfileController {
    private static final String UPLOAD_DIR = "C:\\upload\\avatars";

    @GetMapping("/upload")
    public String showForm(Model model) {
        model.addAttribute("userProfile", new UserProfile());
        return "uploadForm";
    }

    @PostMapping("/upload")
    public String uploadAvatar(@ModelAttribute("userProfile") UserProfile userProfile, Model model) {
        MultipartFile file = userProfile.getAvatar();

        if (file != null && !file.isEmpty()) {
            try {
                File uploadDir = new File(UPLOAD_DIR);
                if (!uploadDir.exists()) {
                    uploadDir.mkdirs();
                }

                String filePath = UPLOAD_DIR + "\\" + file.getOriginalFilename();
                file.transferTo(new File(filePath));

                model.addAttribute("message", "Upload thành công! Tên người dùng: " + userProfile.getUsername());
                model.addAttribute("filename", file.getOriginalFilename());
            } catch (IOException e) {
                model.addAttribute("message", "Upload thất bại: " + e.getMessage());
            }
        } else {
            model.addAttribute("message", "Vui lòng chọn file để upload.");
        }

        return "uploadResult";
    }
}
