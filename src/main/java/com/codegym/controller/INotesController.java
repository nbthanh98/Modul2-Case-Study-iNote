package com.codegym.controller;

import com.codegym.model.Note;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class INotesController {
    @GetMapping("/create-form")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("/note/createForm");
        modelAndView.addObject("note", new Note());
        return modelAndView;
    }
}
