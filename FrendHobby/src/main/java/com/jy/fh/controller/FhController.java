package com.jy.fh.controller;

import com.jy.fh.model.FhVO;
import com.jy.fh.service.FhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FhController {

    @Autowired
    private FhService service;

    //
    //   모든 테이블값 다 지우는 쿼리 만들기 (함수로 만들수있음 만들고 / 프로시저)
    //

    // FN_TEST_BOARD_SELECT(NUMBER)
    // ===> functino 테스트
    @RequestMapping(value = "function", method = RequestMethod.GET)
    public String function(Model model, FhVO vo, RedirectAttributes ra) {
        String test = (String)model.getAttribute("test");
        System.out.println("--model--");
        System.out.println("ra값 : " + test);
        System.out.println("--model--");

        return "/function/test";
    }

    @RequestMapping(value = "function", method = RequestMethod.POST)
    public String function(FhVO vo, RedirectAttributes ra, Model model) {
        System.out.println(vo.getI_board());

        ra.addFlashAttribute("a", "ra.addFlashAttribute 정상 작동");
        ra.addFlashAttribute("result", service.functinoTet(vo));
        ra.addFlashAttribute("test", "test값 나와야됨");
        return "redirect:/function";
    }


    // ===> trigger 테스트
    @RequestMapping(value="/trigger", method = RequestMethod.GET)
    public String trigger(Model model) {
        model.addAttribute("list1", service.selBoard1());
        model.addAttribute("list2", service.selBoard2());

        return "/trigger/test";
    }

    @RequestMapping(value="/trigger", method = RequestMethod.POST)
    public String trigger(Model model, FhVO vo) {

        service.insBoard(vo);

        return "redirect:/trigger";
    }


    // ===> Encoding 테스트용
    @RequestMapping(value = "/encoding", method = RequestMethod.GET)
    public String encoding(Model model) {

        model.addAttribute("list", service.selTest());
        return "/encoding/test";
    }

    @RequestMapping(value = "/encoding", method = RequestMethod.POST)
    public String encoding(FhVO vo) {
        int result = service.test(vo);
        return "redirect:/encoding";
    }

}
