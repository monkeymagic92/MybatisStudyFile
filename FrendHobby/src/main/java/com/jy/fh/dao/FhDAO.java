package com.jy.fh.dao;

import com.jy.fh.model.FhVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface FhDAO {


    // function 테스트
    List<?> functionTest(FhVO vo);


    // trigger 테스트
    int insBoard(FhVO vo);
    List<FhVO> selBoard1();
    List<FhVO> selBoard2();

    // encoding 테스트
    int test(FhVO vo);
    List<FhVO> selTest();
}
