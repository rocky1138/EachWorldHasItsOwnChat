package com.github.rocky1138;
import java.util.LinkedList;
import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerChatEvent;

public class ChatListener implements Listener {

	@EventHandler(priority = EventPriority.NORMAL)
	public void onPlayerChat(final PlayerChatEvent event) {
         
		if (event.isCancelled())
            return;
       
        Player player = event.getPlayer();
        String worldName = player.getWorld().getName();
 
        List<Player> recipients = new LinkedList<Player>();
        for (Player recipient : recipients) {
            if (recipient.getWorld().getName().equals(worldName))
                recipients.add(recipient);
        }
       
        event.getRecipients().clear();
        event.getRecipients().addAll(recipients);
	}
}
