package dev.senseitarzan.fromimagefixer;

import dev.senseitarzan.fromimagefixer.listener.FromImageFixer;
import org.powernukkitx.plugin.PluginBase;

public class Main extends PluginBase {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new FromImageFixer(this.getServer().getScheduler()), this);
    }
}
