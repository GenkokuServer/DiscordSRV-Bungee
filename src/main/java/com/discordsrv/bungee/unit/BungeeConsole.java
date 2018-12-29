/*
 * DiscordSRV-Bungee: Bungee platform support plugin or the DiscordSRV project
 * Copyright (C) 2018 DiscordSRV
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.discordsrv.bungee.unit;

import com.discordsrv.bungee.BungeeContext;
import com.discordsrv.core.api.minecraft.Console;
import lombok.Value;

/**
 * Console implementation, for DiscordSRV-Bungee.
 */
@Value
public class BungeeConsole implements Console {

    private final BungeeContext context;

    /**
     * Invokes a string command onto the console.
     *
     * @param cmd
     *         The command to invoke.
     */
    @Override
    public void invoke(final String cmd) {
        context.getProxyServer().getPluginManager().dispatchCommand(context.getProxyServer().getConsole(), cmd);
    }
}
