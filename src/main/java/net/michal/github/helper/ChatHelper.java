package net.michal.github.helper;

import org.bukkit.entity.Player;

import java.util.List;
import java.util.Objects;

public class ChatHelper {

    public static void sendChatMessage(Player player, String text) {
        if(player != null && !text.equals("")) {
            player.sendMessage(TextHelper.textColor(text));
        }
    }

    public static List<String> sendChatMessages(Player player, List<String> text) {
        if(player != null && !text.equals("")) {
            for(String message : text) {
                player.sendMessage(TextHelper.textColor(message));
            }
        }
        return text;
    }
}
