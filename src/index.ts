import { registerPlugin } from '@capacitor/core';

import type { DemoPluginPlugin } from './definitions';

const DemoPlugin = registerPlugin<DemoPluginPlugin>('DemoPlugin', {
  web: () => import('./web').then(m => new m.DemoPluginWeb()),
});

export * from './definitions';
export { DemoPlugin };
