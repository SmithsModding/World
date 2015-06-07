package com.Orion.Armory.World.Event;

import com.Orion.Armory.API.Events.Common.ActivateArmorAddonEvent;
import com.Orion.Armory.API.Events.Common.ModifyMaterialEvent;
import com.Orion.Armory.API.Events.Common.RegisterMaterialsEvent;
import com.Orion.Armory.Common.Item.Armor.TierMedieval.ArmorMaterialMedieval;
import com.Orion.Armory.Common.Registry.MedievalRegistry;
import com.Orion.Armory.World.Common.Compatibility.ArmoryMedieval;
import com.Orion.Armory.World.Common.GeneralRegistry;
import com.Orion.Armory.World.Util.Client.Colors;
import com.Orion.Armory.World.Util.Client.TranslationKeys;
import com.Orion.Armory.World.Util.References;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import java.util.HashMap;

/**
 * Created by Orion
 * Created on 01.06.2015
 * 11:07
 * <p/>
 * Copyrighted according to Project specific license
 */
public class ArmoryCompatEventHandler
{

    @SubscribeEvent
    public void RegisterMaterialsHandler(RegisterMaterialsEvent pEvent)
    {
        MedievalRegistry.getInstance().registerMaterial(new ArmorMaterialMedieval(References.InternalNames.Materials.Common.Copper, TranslationKeys.Materials.MaterialCopper, "Copper", EnumChatFormatting.RED, true, new HashMap<String, Float>(), new HashMap<String, Integer>(), new HashMap<String, Integer>(), new HashMap<String, Boolean>(), Colors.Metals.Copper, 1454, 0.195F, new ItemStack(GeneralRegistry.tCommonIngots, 1, 0)));
        MedievalRegistry.getInstance().registerMaterial(new ArmorMaterialMedieval(References.InternalNames.Materials.Common.Tin, TranslationKeys.Materials.MaterialTin, "Tin", EnumChatFormatting.WHITE, false, new HashMap<String, Float>(), new HashMap<String, Integer>(), new HashMap<String, Integer>(), new HashMap<String, Boolean>(), Colors.Metals.Tin, 1259, 0.285F, new ItemStack(GeneralRegistry.tCommonIngots, 1, 1)));
        MedievalRegistry.getInstance().registerMaterial(new ArmorMaterialMedieval(References.InternalNames.Materials.Common.Silver, TranslationKeys.Materials.MaterialSilver, "Silver", EnumChatFormatting.WHITE, false, new HashMap<String, Float>(), new HashMap<String, Integer>(), new HashMap<String, Integer>(), new HashMap<String, Boolean>(), Colors.Metals.Silver, 1850, 0.35F, new ItemStack(GeneralRegistry.tCommonIngots, 1, 2)));
        MedievalRegistry.getInstance().registerMaterial(new ArmorMaterialMedieval(References.InternalNames.Materials.Common.Lead, TranslationKeys.Materials.MaterialLead, "Lead", EnumChatFormatting.DARK_BLUE, true, new HashMap<String, Float>(), new HashMap<String, Integer>(), new HashMap<String, Integer>(), new HashMap<String, Boolean>(), Colors.Metals.Lead, 2869, 0.175F, new ItemStack(GeneralRegistry.tCommonIngots, 1, 3)));
    }

    @SubscribeEvent
    public void ActivateArmorAddonHandler(ActivateArmorAddonEvent pEvent)
    {
        if (!pEvent.iArmorMaterial.getType().equals(com.Orion.Armory.Util.References.InternalNames.Tiers.MEDIEVAL))
            return;

        if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Helmet.TOP))
        {
            ArmoryMedieval.HandleTopHeadMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Helmet.RIGHT))
        {
            ArmoryMedieval.HandleRightSideHeadMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Helmet.LEFT))
        {
            ArmoryMedieval.HandleLeftSideHeadMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Chestplate.SHOULDERLEFT))
        {
            ArmoryMedieval.HandleLeftShoulderPadMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Chestplate.SHOULDERRIGHT))
        {
            ArmoryMedieval.HandleRightShouldPadMaterialsMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Chestplate.FRONTLEFT))
        {
            ArmoryMedieval.HandleLeftFrontChestplateMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Chestplate.FRONTRIGHT))
        {
            ArmoryMedieval.HandleRightFrontChestplateMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Chestplate.BACKLEFT))
        {
            ArmoryMedieval.HandleLeftBackChestplateMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Chestplate.BACKRIGHT))
        {
            ArmoryMedieval.HandleRightBackChestplateMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Leggings.FRONTLEFT))
        {
            ArmoryMedieval.HandleLeftFrontLeggingsMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Leggings.FRONTRIGHT))
        {
            ArmoryMedieval.HandleRightFrontLeggingsMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Leggings.BACKLEFT))
        {
            ArmoryMedieval.HandleLeftBackLeggingsMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Leggings.BACKRIGHT))
        {
            ArmoryMedieval.HandleRightBackLegginsMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Shoes.LEFT))
        {
            ArmoryMedieval.HandleLeftShoesMaterials(pEvent);
        }
        else if (!pEvent.iAddon.getAddonPositionID().equals(com.Orion.Armory.Util.References.InternalNames.AddonPositions.Shoes.RIGHT))
        {
            ArmoryMedieval.HandleRightShoesMaterials(pEvent);
        }
    }

    @SubscribeEvent
    public void ModifyMaterialHandler(ModifyMaterialEvent pEvent)
    {
        if (pEvent.iArmor.getInternalName().equals(com.Orion.Armory.Util.References.InternalNames.Armor.MEDIEVALHELMET))
        {
            ArmoryMedieval.ModifyMaterialForHelmet(pEvent);
        }
        else if (pEvent.iArmor.getInternalName().equals(com.Orion.Armory.Util.References.InternalNames.Armor.MEDIEVALCHESTPLATE))
        {
            ArmoryMedieval.ModifyMaterialForChestplate(pEvent);
        }
        else if (pEvent.iArmor.getInternalName().equals(com.Orion.Armory.Util.References.InternalNames.Armor.MEDIEVALLEGGINGS))
        {
            ArmoryMedieval.ModifyMaterialForLeggings(pEvent);
        }
        else if (pEvent.iArmor.getInternalName().equals(com.Orion.Armory.Util.References.InternalNames.Armor.MEDIEVALSHOES))
        {
            ArmoryMedieval.ModifyMaterialForShoes(pEvent);
        }
        else
        {
            ArmoryMedieval.ModifyMaterialForOther(pEvent);
        }
    }

}
