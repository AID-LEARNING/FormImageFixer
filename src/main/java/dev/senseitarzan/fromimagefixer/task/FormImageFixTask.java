package dev.senseitarzan.fromimagefixer.task;

import org.cloudburstmc.protocol.bedrock.packet.UpdateAttributesPacket;
import org.powernukkitx.Player;
import org.powernukkitx.entity.Attribute;
import org.powernukkitx.scheduler.Task;

import java.util.concurrent.atomic.AtomicInteger;

public class FormImageFixTask extends Task {

    private final Player player;
    private final AtomicInteger count = new AtomicInteger(5);
    public FormImageFixTask(Player player) {
        this.player = player;
    }

    @Override
    public void onRun(int currentTick) {

        if(count.getAndDecrement() == 0 || !player.isOnline()){
            this.cancel();
            return;
        }
        var attr = player.getAttributes().get(Attribute.EXPERIENCE_LEVEL);
        var packet = new UpdateAttributesPacket();
        packet.setRuntimeID(player.getId());
        packet.getAttributeList().add(attr.toNetwork());
        player.sendPacket(packet);
    }
}
