package com.example.krupa.music_structure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;



public class MusicStructureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_structure_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button artistButton = (Button) findViewById(R.id.button_artist);
        Button albumButton = (Button) findViewById(R.id.button_album);
        Button genreButton = (Button) findViewById(R.id.button_genre);
        Button playlistButton = (Button) findViewById(R.id.button_playlist);

        artistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAlbum = new Intent(view.getContext(), ArtistActivity.class);
                startActivity(intentAlbum);
            }
        });

        albumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentArtist = new Intent(view.getContext(), AlbumActivity.class);
                startActivity(intentArtist);
            }
        });

        genreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGenre = new Intent(view.getContext(), GenreActivity.class);
                startActivity(intentGenre);
            }
        });

        playlistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPlaylist = new Intent(view.getContext(), PlaylistActivity.class);
                startActivity(intentPlaylist);
            }
        });
    }
}
