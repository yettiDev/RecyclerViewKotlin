package com.example.recyclerteste

import com.example.recyclerteste.models.Anime

class DataSourceMock {

    companion object{
        fun dataSourceMock():ArrayList<Anime> {
             val list:ArrayList<Anime> = ArrayList()

            list.add(
                Anime(
                "Naruto",
                    "https://www.crunchyroll.com/imgsrv/display/thumbnail/480x720/catalog/crunchyroll/01ec367b44f0a568430a957e042639af.jpe"
            )
            )
            list.add(
                Anime(
                    "One Piece",
                    "https://www.crunchyroll.com/imgsrv/display/thumbnail/480x720/catalog/crunchyroll/2239c7b46b2e491ae33b33ff980e9fb1.jpe"
                )
            )
            list.add(
                Anime(
                    "Hunter x Hunter",
                        "https://www.crunchyroll.com/imgsrv/display/thumbnail/480x720/catalog/crunchyroll/cbb55a6382682bf71e91f685c6473c5a.jpe"
            )
            )
            list.add(
                Anime(
                    "Dragon Ball Z",
                "https://www.crunchyroll.com/imgsrv/display/thumbnail/480x720/catalog/crunchyroll/35e4ac6339f5fdcc164160a5755790cd.jpe"
                )
            )


            return list
        }
    }

}