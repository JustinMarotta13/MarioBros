package com.justinmarotta.game.sprites;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.World;
import com.justinmarotta.game.MarioBros;
import com.justinmarotta.game.scenes.Hud;

public class Brick extends InteractiveTileObject{

    public Brick(World world, TiledMap map, Rectangle bounds){

        super(world, map, bounds);
        fixture.setUserData(this);
        setCategoryFilter(MarioBros.BRICK_BIT);
    }

    @Override
    public void onHeadHit() {
        Gdx.app.log("Brick", "Collision");
        setCategoryFilter(MarioBros.DESTROYED_BIT);
        getCell().setTile(null);
        Hud.addScore(100);
        MarioBros.manager.get("audio/sounds/breakblock.wav", Sound.class).play();
    }
}
