package custo.javax.module.event.type;

import custo.javax.module.event.ModuleAction;
import custo.javax.module.model.Module;

/**
 * Created by linneya on 30/06/16.
 */
public class ModuleLoaded extends ModuleAction{
    public ModuleLoaded(Module module) {
        super(module);
    }
}
