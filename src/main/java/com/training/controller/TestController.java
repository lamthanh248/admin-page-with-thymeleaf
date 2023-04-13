package com.training.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/accounts")
    public String showAccount(Model model) {
        model.addAttribute("container", "components/container/accounts");
        return "index";
    }
    @GetMapping("/product")
    public String product(Model model) {
        model.addAttribute("container", "components/container/product");
        return "index";
    }
    @GetMapping("/add-product")
    public String addProduct(Model model) {
        model.addAttribute("container", "components/container/add-product");
        return "index";
    }

    @GetMapping("/edit-product")
    public String editProduct(Model model) {
        model.addAttribute("container", "components/container/edit-product");
        return "index";
    }

    @GetMapping({"/","/main"})
    public String index(Model model) {
        model.addAttribute("container", "components/container/main");
        return "index";
    }

    @GetMapping("/login")
    public String loginFile(Model model) {
        return "login-file";
    }

    @GetMapping("/notification")
    public String notificationManage(Model model) {
        model.addAttribute("container", "components/container/notification");
        return "index";
    }
    @GetMapping("/order-list")
    public String orderListManage(Model model) {
        model.addAttribute("container", "components/container/order-list");
        return "index";
    }
    @GetMapping("/post-manage")
    public String postManage(Model model) {
        model.addAttribute("container", "components/container/post-manage");
        return "index";
    }

    @GetMapping("/create-user-form")
    public String createUserForm(Model model) {

        return "index";
    }
    @GetMapping("/update-user-form")
    public String updateUserForm(Model model) {
        return "index";
    }
}
