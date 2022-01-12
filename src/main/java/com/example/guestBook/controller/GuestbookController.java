package com.example.guestBook.controller;


import com.example.guestBook.dto.PageRequestDTO;
import com.example.guestBook.service.GuestbookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/guestbook")
@Log4j2
@RequiredArgsConstructor
public class GuestbookController {
    private final GuestbookService service;

    @GetMapping("/")
    public String index(){
        return "redirect:/guestbook/list";
    }

    @GetMapping( "/list")
    public String list(PageRequestDTO pageRequestDTO, Model model){
        log.info("list........" + pageRequestDTO);

        model.addAttribute("result", service.getList(pageRequestDTO));
        return "/guestbook/list";
    }


}
