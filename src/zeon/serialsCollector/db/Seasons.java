package zeon.serialsCollector.db;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * class for sqlite "seasons" table
 * Date: 23.07.13
 * Time: 12:59
 */

@DatabaseTable
public class Seasons {

    @DatabaseField(id = true, unique=true)
    private int season_id;

    @DatabaseField
    private int season_number;

    @DatabaseField
    private int last_episode;

    @DatabaseField
    private String translate;

    @DatabaseField
    private String quality;

    @DatabaseField
    private String rip;

    Seasons() {
        // all persisted classes must define a no-arg constructor with at least package visibility
    }

    //constructor
    public Seasons(int season_id, int season_number, int last_episode, String translate, String quality, String rip) {
        this.season_id = season_id;
        this.season_number = season_number;
        this.last_episode = last_episode;
        this.translate = translate;
        this.quality = quality;
        this.rip = rip;
    }

    //----------------------getters and setters-----------------------

    public int getSeason_id() {
        return season_id;
    }

    public void setSeason_id(int season_id) {
        this.season_id = season_id;
    }

    public int getSeason_number() {
        return season_number;
    }

    public void setSeason_number(int season_number) {
        this.season_number = season_number;
    }

    public int getLast_episode() {
        return last_episode;
    }

    public void setLast_episode(int last_episode) {
        this.last_episode = last_episode;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getRip() {
        return rip;
    }

    public void setRip(String rip) {
        this.rip = rip;
    }

    //----------------------end of getters and setters-----------------------

}
