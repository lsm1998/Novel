package com.novel.common.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseEntity implements Serializable
{
    private Integer status;
    private Integer createTime;
    private Integer updateTime;

    public static <E extends BaseEntity> E initEntity(Class<E> clazz)
    {
        try
        {
            E entity = clazz.getConstructor().newInstance();
            int now = (int) (System.currentTimeMillis() / 1000);
            entity.setStatus(1);
            entity.setCreateTime(now);
            entity.setUpdateTime(now);
            return entity;
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
