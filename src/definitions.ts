export interface DemoPluginPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
  getPressure(): Promise<{ pressure: number }>;
  getLight(): Promise<{ light: number }>;
  initPlugin(): Promise<{ value: string }>;
}
