export interface DemoPluginPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
