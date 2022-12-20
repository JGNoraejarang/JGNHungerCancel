package hc.hungry_cancel;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
import java.util.logging.Logger;
import org.bukkit.entity.Player;

/**
 * 이 플러그인은 대한민국의 개발자 JGNoraejarang에 의해 작성되었습니다.
 * 공식 연락처는 Discord: JGNoraejarang#0796입니다.
 *
 * This plugin is written by JGNoraejarang, Programmer in Republic of Korea.
 * Official Contact: Discord JGNoraejarang#0796
 */

public final class Hungry_Cancel extends JavaPlugin implements Listener{

    Logger logger = getServer().getLogger();

    @Override
    public void onEnable() {
        // Plugin startup logic
        logger.info("[JGN-HungerCancel] 플러그인을 활성화했습니다.");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        logger.info("[JGN-HungerCancel] 플러그인을 비활성화했습니다.");
    }

    @EventHandler
    public void onHunger(PlayerMoveEvent pme){
        Player player = pme.getPlayer();
        player.setFoodLevel(20);
    }
}
