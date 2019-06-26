package project.turnstile;


import project.domain.TurnstilePossibleState;

public interface TurnstileState {
  void next(Turnstile turnstile);

  void previous(Turnstile turnstile);

  TurnstilePossibleState getTurnsileState();
}
