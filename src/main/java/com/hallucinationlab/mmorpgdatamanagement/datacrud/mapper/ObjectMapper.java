package com.hallucinationlab.mmorpgdatamanagement.datacrud.mapper;


import com.hallucinationlab.mmorpgdatamanagement.datacrud.dto.CharacterDTO;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.domain.entity.Character;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class ObjectMapper {


    private static ModelMapper modelMapper = new ModelMapper();


    public static <O,D> D parseObject(O origin, Class<D> destination) {
        return modelMapper.map(origin,destination);
    }

    public static List<CharacterDTO> parseListObject(List<Character> all, Class<CharacterDTO> heroVOClass) {
        List<CharacterDTO> characterDTOList = new ArrayList<>();
        for (Character character : all) {
            characterDTOList.add(parseObject(character, CharacterDTO.class));
        }
        return characterDTOList;
    }
}
