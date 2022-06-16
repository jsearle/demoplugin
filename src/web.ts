import { WebPlugin } from '@capacitor/core';

import type { DemoPluginPlugin } from './definitions';

export class DemoPluginWeb extends WebPlugin implements DemoPluginPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
  async getPressure(): Promise<{ pressure: number }> {
    console.log('Pressure');
    return {pressure: 1024+Math.random()*100};
  }
  async getLight(): Promise<{ light: number }> {
    console.log('Light');
    return {light: 1000+Math.random()*1000};
  }
  async initPlugin(): Promise<{ value: string }> {
    console.log('Init');
    return {value: 'ok'};
  }
}
