package com.lsm198.reptile.service;

public interface NovelService
{
    // 爬取所有
    void reptileNovelAll();

    // 根据关键字爬
    void reptileNovelByKeyword(String keyword);
}
