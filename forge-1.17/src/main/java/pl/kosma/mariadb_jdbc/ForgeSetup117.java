package pl.kosma.mariadb_jdbc;

import net.minecraftforge.fml.IExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fmllegacy.network.FMLNetworkConstants;

public class ForgeSetup117 {
    public ForgeSetup117() {
        // Prevent "incompatible mod list" errors.
        // This will work in 1.17.1 and above.
        ModLoadingContext.get().registerExtensionPoint(IExtensionPoint.DisplayTest.class,
            () -> new IExtensionPoint.DisplayTest(() -> FMLNetworkConstants.IGNORESERVERONLY, (incoming, isNetwork) -> true));
    }
}
