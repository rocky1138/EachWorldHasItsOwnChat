package me.rocky1138;
import java.util.LinkedList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerChatEvent;

public class ChatListener implements Listener {

	@EventHandler(priority = EventPriority.NORMAL)
	public void onPlayerChat(final PlayerChatEvent event) {
         
		//if (event.isCancelled())
        //    return;
		
		event.getRecipients().clear();

        String worldName = event.getPlayer().getWorld().getName();
 
        List<Player> recipients = new LinkedList<Player>();
       
        for (Player recipient : Bukkit.getServer().getOnlinePlayers()) {
            if (recipient.getWorld().getName().equals(worldName)) {
            	System.out.print(recipient.getWorld().getName());
                recipients.add(recipient);
            } else {
            	System.out.print(recipient.getWorld().getName());
            }
        }
        
        event.getRecipients().addAll(recipients);
	}
}
