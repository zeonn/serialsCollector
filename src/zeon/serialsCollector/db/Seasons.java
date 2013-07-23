package zeon.serialsCollector.db;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created with IntelliJ IDEA.
 * User: zeon
 * Date: 23.07.13
 * Time: 12:59
 * To change this template use File | Settings | File Templates.
 */

@DatabaseTable
public class Seasons {

    @DatabaseField(id = true, unique=true)
    private int season_id;

    @DatabaseField
    private String translate;

    @DatabaseField
    private String quality;

    @DatabaseField
    private String rip;

    @DatabaseField
    private int season_number;

    @DatabaseField
    private int last_episode;

    Seasons() {}

}
