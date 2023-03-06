package net.michal.github.helper;

import net.md_5.bungee.api.ChatColor;

import java.util.ArrayList;
import java.util.List;

public class TextHelper {

    public static String textColor(String text) {
        return ChatColor.translateAlternateColorCodes('&', text)
                .replace(">>", "»")
                .replace("<<", "«");
    }
    public static List<String> textColors(List<String> strings) {
        List<String> colors = new ArrayList<>();
        for (String s : strings)
            colors.add(textColor(s));
        return colors;
    }
}
