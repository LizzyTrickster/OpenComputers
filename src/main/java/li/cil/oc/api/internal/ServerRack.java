package li.cil.oc.api.internal;

import li.cil.oc.api.component.RackMountable;
import li.cil.oc.api.network.Environment;
import li.cil.oc.api.network.SidedEnvironment;
import net.minecraft.inventory.IInventory;

/**
 * This interface is implemented as a marker by server racks.
 * <p/>
 * This is implemented by server rack tile entities. That means you can use
 * this to check for server racks by using:
 * <pre>
 *     if (tileEntity instanceof ServerRack) {
 * </pre>
 * <p/>
 * Server racks <em>do not</em> serve as environment for the computer nodes of
 * servers. That's what the {@link li.cil.oc.api.internal.Server}s are for.
 * <p/>
 * The only purpose is to allow identifying tile entities as server racks
 * via the API, i.e. without having to link against internal classes. This
 * also means that <em>you should not implement this</em>.
 */
public interface ServerRack extends Environment, SidedEnvironment, Rotatable, IInventory {
    /**
     * The server in the specified slot.
     * <p/>
     * This can be <tt>null</tt>, for example when there is no server installed
     * in that slot.
     *
     * @return the server currently hosted in the specified slot.
     */
    RackMountable getMountable(int slot);
}
