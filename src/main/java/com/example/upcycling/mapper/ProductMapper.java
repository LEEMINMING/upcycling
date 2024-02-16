package com.example.upcycling.mapper;


import com.example.upcycling.domain.dto.FaqDto;
import com.example.upcycling.domain.dto.ProductDto;
import com.example.upcycling.domain.vo.Criteria;
import com.example.upcycling.domain.vo.ProductVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ProductMapper {
    List<ProductVo> selectAll(@Param("criteria") Criteria criteria);

    int selectTotal();

    Optional<ProductVo> selectAll2(Long productNumber);

    Optional<ProductDto> selectClothes();
    Optional<ProductDto> selectClothes2();
    Optional<ProductDto> selectClothes3();
}
