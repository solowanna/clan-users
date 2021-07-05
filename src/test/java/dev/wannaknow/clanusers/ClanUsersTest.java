package dev.wannaknow.clanusers;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ClanUsersTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(ClanUsersPlugin.class);
		RuneLite.main(args);
	}
}