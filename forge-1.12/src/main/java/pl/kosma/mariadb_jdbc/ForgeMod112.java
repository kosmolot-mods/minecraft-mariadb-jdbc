package pl.kosma.mariadb_jdbc;

import net.minecraftforge.fml.common.Mod;

@Mod(value = "mariadb_jdbc", modid = "mariadb_jdbc", acceptableRemoteVersions = "*")
public class ForgeMod112
{
    public ForgeMod112() {
        try { Class.forName("ForgeSetup113").getDeclaredConstructor().newInstance(); } catch (Exception e) {}
        try { Class.forName("ForgeSetup117").getDeclaredConstructor().newInstance(); } catch (Exception e) {}
    }
}
