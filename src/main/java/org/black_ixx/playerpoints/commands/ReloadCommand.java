package org.black_ixx.playerpoints.commands;

import java.util.Collections;
import java.util.List;
import org.black_ixx.playerpoints.PlayerPoints;
import org.black_ixx.playerpoints.manager.LocaleManager;
import org.bukkit.command.CommandSender;

public class ReloadCommand extends PointsCommand {

    public ReloadCommand() {
        super("reload");
    }

    @Override
    public void execute(PlayerPoints plugin, CommandSender sender, String[] args) {
        plugin.reload();
        plugin.getManager(LocaleManager.class).sendMessage(sender, "command-reload-success");
    }

    @Override
    public List<String> tabComplete(PlayerPoints plugin, CommandSender sender, String[] args) {
        return Collections.emptyList();
    }

}
