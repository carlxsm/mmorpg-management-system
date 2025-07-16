package com.hallucinationlab.mmorpgdatamanagement.datacrud.mapper;

import com.hallucinationlab.mmorpgdatamanagement.datacrud.dto.CharacterDTO;
import com.hallucinationlab.mmorpgdatamanagement.datacrud.domain.entity.Character;

public class HeroMapper {

    public CharacterDTO entityToVO(Character character){
        CharacterDTO vo = new CharacterDTO();
        vo.setId(character.getId());
        vo.setName(character.getName());
        vo.setLevel(character.getLevel());
        vo.setXp(character.getXp());
        vo.setHp(character.getHp());
        vo.setMp(character.getMp());
        return vo;
    }


    public Character VOToEntity(CharacterDTO characterDTO){
        Character entity = new Character();
        entity.setId(characterDTO.getId());
        entity.setName(characterDTO.getName());
        entity.setLevel(characterDTO.getLevel());
        entity.setXp(characterDTO.getXp());
        entity.setHp(characterDTO.getHp());
        entity.setMp(characterDTO.getMp());
        return null;
    }
}
