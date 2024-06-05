package com.hallucinationlab.mmorpgdatamanagement.datacrud.mapper.custom;

import com.hallucinationlab.mmorpgdatamanagement.datacrud.model.character.Hero;

public class HeroMapper {

    public com.hallucinationlab.mmorpgdatamanagement.datacrud.data.vo.v1.HeroVO entityToVO(Hero hero){
        com.hallucinationlab.mmorpgdatamanagement.datacrud.data.vo.v1.HeroVO vo = new com.hallucinationlab.mmorpgdatamanagement.datacrud.data.vo.v1.HeroVO();
        vo.setId(hero.getId());
        vo.setName(hero.getName());
        vo.setLevel(hero.getLevel());
        vo.setXp(hero.getXp());
        vo.setHp(hero.getHp());
        vo.setMp(hero.getMp());
        return vo;
    }


    public Hero VOToEntity(com.hallucinationlab.mmorpgdatamanagement.datacrud.data.vo.v1.HeroVO heroVO){
        Hero entity = new Hero();
        entity.setId(heroVO.getId());
        entity.setName(heroVO.getName());
        entity.setLevel(heroVO.getLevel());
        entity.setXp(heroVO.getXp());
        entity.setHp(heroVO.getHp());
        entity.setMp(heroVO.getMp());
        return null;
    }
}
