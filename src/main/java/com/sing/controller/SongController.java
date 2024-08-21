package com.sing.controller;


import com.sing.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class SongController {
    @GetMapping("/song")
    public ModelAndView showForm(){
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("song", new Song());
        return modelAndView;
    }
    @PostMapping("/validateSong")
    public ModelAndView checkValidation(@Valid @ModelAttribute("song") Song song,
                                        BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return new ModelAndView("/index");
        }
        return new ModelAndView("/results");
    }
}
