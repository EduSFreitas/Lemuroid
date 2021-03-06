package com.swordfish.lemuroid.lib.library

import com.swordfish.lemuroid.lib.R

fun GameSystem.metaSystemID() = MetaSystemID.fromSystemID(id)

/** Meta systems represents a collection of systems which appear the same to the user. It's currently
 *  only for Arcade (without separating FBNeo, MAME2000 or MAME2003). */
enum class MetaSystemID(val titleResId: Int, val imageResId: Int, val systemIDs: List<SystemID>) {
    NES(
        R.string.game_system_title_nes,
        R.drawable.game_system_nes,
        listOf(SystemID.NES)
    ),
    SNES(
        R.string.game_system_title_snes,
        R.drawable.game_system_snes,
        listOf(SystemID.SNES)
    ),
    GENESIS(
        R.string.game_system_title_genesis,
        R.drawable.game_system_genesis,
        listOf(SystemID.GENESIS)
    ),
    GB(
        R.string.game_system_title_gb,
        R.drawable.game_system_gb,
        listOf(SystemID.GB)
    ),
    GBC(
        R.string.game_system_title_gbc,
        R.drawable.game_system_gbc,
        listOf(SystemID.GBC)
    ),
    GBA(
        R.string.game_system_title_gba,
        R.drawable.game_system_gba,
        listOf(SystemID.GBA)
    ),
    N64(
        R.string.game_system_title_n64,
        R.drawable.game_system_n64,
        listOf(SystemID.N64)
    ),
    SMS(
        R.string.game_system_title_sms,
        R.drawable.game_system_sms,
        listOf(SystemID.SMS)
    ),
    PSP(
        R.string.game_system_title_psp,
        R.drawable.game_system_psp,
        listOf(SystemID.PSP)
    ),
    NDS(
        R.string.game_system_title_nds,
        R.drawable.game_system_ds,
        listOf(SystemID.NDS)
    ),
    GG(
        R.string.game_system_title_gg,
        R.drawable.game_system_gg,
        listOf(SystemID.GG)
    ),
    ATARI2600(
        R.string.game_system_title_atari2600,
        R.drawable.game_system_atari2600,
        listOf(SystemID.ATARI2600)
    ),
    PSX(
        R.string.game_system_title_psx,
        R.drawable.game_system_psx,
        listOf(SystemID.PSX)
    ),
    ARCADE(
        R.string.game_system_title_arcade,
        R.drawable.game_system_arcade,
        listOf(SystemID.FBNEO, SystemID.MAME2003PLUS)
    );

    companion object {
        fun fromSystemID(systemID: SystemID): MetaSystemID {
            return when (systemID) {
                SystemID.FBNEO -> ARCADE
                SystemID.MAME2003PLUS -> ARCADE
                SystemID.ATARI2600 -> ATARI2600
                SystemID.GB -> GB
                SystemID.GBC -> GBC
                SystemID.GBA -> GBA
                SystemID.GENESIS -> GENESIS
                SystemID.GG -> GG
                SystemID.N64 -> N64
                SystemID.NDS -> NDS
                SystemID.NES -> NES
                SystemID.PSP -> PSP
                SystemID.PSX -> PSX
                SystemID.SMS -> SMS
                SystemID.SNES -> SNES
            }
        }
    }
}
