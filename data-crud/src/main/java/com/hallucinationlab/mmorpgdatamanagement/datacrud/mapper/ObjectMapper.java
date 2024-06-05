package com.hallucinationlab.mmorpgdatamanagement.datacrud.mapper;


import com.hallucinationlab.mmorpgdatamanagement.datacrud.data.vo.v1.HeroVO;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.model.character.Hero;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class ObjectMapper {


    private static ModelMapper modelMapper = new ModelMapper();


    public static <O,D> D parseObject(O origin, Class<D> destination) {
        return modelMapper.map(origin,destination);
    }

    public static List<HeroVO> parseListObject(List<Hero> all, Class<HeroVO> heroVOClass) {
        List<HeroVO> heroVOList = new ArrayList<>();
        for (Hero hero : all) {
            heroVOList.add(parseObject(hero,HeroVO.class));
        }
        return heroVOList;
    }
}
