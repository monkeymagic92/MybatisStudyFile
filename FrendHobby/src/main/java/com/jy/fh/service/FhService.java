package com.jy.fh.service;

import com.jy.fh.dao.FhDAO;
import com.jy.fh.model.FhVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FhService {

    @Autowired
    private FhDAO dao;


    // ===> FUNCTION 테스트
    public List<?> functinoTet(FhVO vo) {
        System.out.println("SErvice 값 : " + vo.getI_board());

        return dao.functionTest(vo);
    }


    // ===> trigger 테스트
    public List<FhVO> selBoard1() {
        return dao.selBoard1();
    }

    public List<FhVO> selBoard2() {
        return dao.selBoard2();
    }

    public int insBoard(FhVO vo) {
        return dao.insBoard(vo);
    }


    // ====> encoding 테스트
    public int test(FhVO vo) {
        return dao.test(vo);
    }

    public List<FhVO> selTest() {
        return dao.selTest();
    }
}
