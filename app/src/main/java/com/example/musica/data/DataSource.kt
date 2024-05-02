package com.example.musica.data

import com.example.musica.model.Album

class DataSource {
    fun getAlbmes(): MutableList<Album>{
        var  albumes:MutableList<Album> = mutableListOf()
        albumes.add(Album("Popayan","2024","https://media.traveler.es/photos/61376f8bd4923f67e298ef5b/master/w_1600%2Cc_limit/130738.jpg"))
        albumes.add(Album("Champions Worl","2022","https://www.conclusion.com.ar/wp-content/uploads/2022/12/messi-copa.jpg"))
        albumes.add(Album("Album 1","2016","https://mediaim.expedia.com/destination/1/38c11e0de37571fc86e2017b76ffbda4.jpg"))
        albumes.add(Album("Popayan","2023","https://wallpapers-clan.com/wp-content/uploads/2023/12/lionel-messi-barcelona-10-desktop-wallpaper-preview.jpg"))
        albumes.add(Album("Messi","2020","https://www.conclusion.com.ar/wp-content/uploads/2022/12/messi-copa.jpg"))
        albumes.add(Album("Barcelona","2018","https://wallpapers-clan.com/wp-content/uploads/2023/12/lionel-messi-barcelona-10-desktop-wallpaper-preview.jpg"))
        albumes.add(Album("World Cup","2014","https://www.conclusion.com.ar/wp-content/uploads/2022/12/messi-copa.jpg"))
       /* albumes.add(Album("caver","2003","https://www.educaciontrespuntocero.com/wp-content/uploads/2020/04/mejores-bancos-de-imagenes-gratis.jpg"))
        albumes.add(Album("caver","2003","https://www.educaciontrespuntocero.com/wp-content/uploads/2020/04/mejores-bancos-de-imagenes-gratis.jpg"))
        albumes.add(Album("caver","2003","https://www.educaciontrespuntocero.com/wp-content/uploads/2020/04/mejores-bancos-de-imagenes-gratis.jpg"))
        albumes.add(Album("caver","2003","https://www.educaciontrespuntocero.com/wp-content/uploads/2020/04/mejores-bancos-de-imagenes-gratis.jpg"))
        albumes.add(Album("caver","2003","https://www.educaciontrespuntocero.com/wp-content/uploads/2020/04/mejores-bancos-de-imagenes-gratis.jpg"))*/
        return albumes
    }
}