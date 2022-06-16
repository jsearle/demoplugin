import { WebPlugin } from '@capacitor/core';

import type { DemoPluginPlugin } from './definitions';

export class DemoPluginWeb extends WebPlugin implements DemoPluginPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
