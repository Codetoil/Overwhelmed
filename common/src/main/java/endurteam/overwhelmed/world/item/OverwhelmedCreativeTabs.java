/**
 *  Overwhelmed, a Minecraft overhauling and adding new features to the Overworld's surface!<br>
 *  Copyright (C) 2023  Endurteam<br>
 *  <br>
 *  This program is free software: you can redistribute it and/or modify<br>
 *  it under the terms of the GNU General Public License as published by<br>
 *  the Free Software Foundation, either version 3 of the License, or<br>
 *  any later version.<br>
 *  <br>
 *  This program is distributed in the hope that it will be useful,<br>
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of<br>
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the<br>
 *  GNU General Public License for more details.<br>
 *  <br>
 *  You should have received a copy of the GNU General Public License with<br>
 *  the Minecraft Linking Exception<br>
 *  along with this program.  If not, see <https://www.gnu.org/licenses/> and<br>
 *  <https://gist.github.com/triphora/588f353802a3b0ea649e4fc85f75e583/>
 */

package endurteam.overwhelmed.world.item;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import endurteam.overwhelmed.Overwhelmed;

public class OverwhelmedCreativeTabs {

    public static final RegistrySupplier<CreativeModeTab> overwhelmedTab = Overwhelmed.CREATIVE_MODE_TABS.register(
            "overwhelmed_tab", () ->  dev.architectury.registry.CreativeTabRegistry.create(
                    Component.translatable("category.overwhelmed"),
                    () -> new ItemStack(OverwhelmedItems.snailShellItem.get())
            )
    );

    public static void registerCreativeTab() {
        Overwhelmed.CREATIVE_MODE_TABS.register();
    }
}
