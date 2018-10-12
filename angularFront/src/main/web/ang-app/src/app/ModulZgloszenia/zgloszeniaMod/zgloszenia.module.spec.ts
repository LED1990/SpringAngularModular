import { ZgloszeniaModule } from './zgloszenia.module';

describe('ZgloszeniaModule', () => {
  let zgloszeniaModule: ZgloszeniaModule;

  beforeEach(() => {
    zgloszeniaModule = new ZgloszeniaModule();
  });

  it('should create an instance', () => {
    expect(zgloszeniaModule).toBeTruthy();
  });
});
