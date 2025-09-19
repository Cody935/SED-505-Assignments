#ifndef VISITOR_H
#define VISITOR_H

class Hammer;
class Screwdriver;
class Apple;
class Orange;

class Visitor {
public:
    virtual void visit(Hammer& hammer) = 0;
    virtual void visit(Screwdriver& screwdriver) = 0;
    virtual void visit(Apple& apple) = 0;
    virtual void visit(Orange& orange) = 0;

    virtual ~Visitor() = default;
};

#endif // VISITOR_H
