package sekerin.museum.javamuseum.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sekerin.museum.javamuseum.services.UserService;

@Controller
public class AdminController {
    @Autowired
    private UserService userService;

    @GetMapping("/admin")
    public String userList(Model model) {
        model.addAttribute("users", userService.allUsers());
        return "admin";
    }

    @GetMapping("/admin/change/{userId}")
    public String Change (@PathVariable("userId") Long userId, Model model)
    {
        userService.changeUser(userId);
        return "redirect:/admin";
    }

    @PostMapping("/admin/delete/{userId}")
    public String  deleteUser(@PathVariable("userId") Long userId, Model model) {
        userService.deleteUser(userId);
        return "redirect:/admin";
    }

}
