package Vererbung;

public abstract class Character
{
    public String name;
    
    public float hp;
    public float damage;
    public float defense;
    public boolean dead;
    
    public Character(String _name, float _hp, float _damage, float _defense)
    {
        name = _name;
        hp = _hp;
        damage = _damage;
        defense = _defense;
    }
    
    public void TakeDamage(float damageTaken)
    {
        damageTaken -= defense;
        
        System.out.println(name + " nimmt " + damageTaken + " Schaden");
        
        if (damageTaken <= 0)
            return;
        
        hp -= damageTaken;
        System.out.println("HP: " + hp);
        
        if (hp <= 0)
            Die();
    }
    
    public void LowerDefense(float by)
    {
        defense -= by;
        if (defense < 0)
            defense = 0;
        
        System.out.println("Verteidigung von " + name + " sinkt auf " + defense);
    }
    
    void Die()
    {
        dead = true;
        System.out.println(name + " ist gestorben");
    }
}