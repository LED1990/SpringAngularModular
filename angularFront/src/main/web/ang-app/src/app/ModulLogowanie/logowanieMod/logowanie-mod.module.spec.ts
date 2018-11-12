import { LogowanieModModule } from './logowanie-mod.module';

describe('LogowanieModModule', () => {
  let logowanieModModule: LogowanieModModule;

  beforeEach(() => {
    logowanieModModule = new LogowanieModModule();
  });

  it('should create an instance', () => {
    expect(logowanieModModule).toBeTruthy();
  });
});
