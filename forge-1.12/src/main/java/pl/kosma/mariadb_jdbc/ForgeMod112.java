package pl.kosma.mariadb_jdbc;

import net.minecraftforge.fml.common.Mod;

@Mod(value = "mariadb_jdbc", modid = "mariadb_jdbc", acceptableRemoteVersions = "*")
public class ForgeMod112
{
    public ForgeMod112() {
        try { new ForgeSetup113(); } catch (Throwable e) {}
        try { new ForgeSetup117(); } catch (Throwable e) {}
    }
}
