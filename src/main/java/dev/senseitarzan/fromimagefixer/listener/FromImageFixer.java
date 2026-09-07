package dev.senseitarzan.fromimagefixer.listener;

import dev.senseitarzan.fromimagefixer.task.FormImageFixTask;
import org.cloudburstmc.protocol.bedrock.packet.ModalFormRequestPacket;
import org.powernukkitx.event.EventHandler;
import org.powernukkitx.event.EventPriority;
import org.powernukkitx.event.Listener;
import org.powernukkitx.event.server.PacketSendEvent;
import org.powernukkitx.plugin.Plugin;

public class FromImageFixer implements Listener {

    private final Plugin plugin;

    public FromImageFixer(Plugin plugin) {
        this.plugin = plugin;
    }


    @EventHandler(priority = EventPriority.MONITOR)
    public void handleSendPacket(PacketSendEvent event) {
        if(event.getPacket() instanceof ModalFormRequestPacket){
            var target = event.getPlayer();
            this.plugin.getServer().getScheduler().scheduleRepeatingTask(new FormImageFixTask(target), 10);
        }
    }
}
